package com.minhpham;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Base64;

class Idea_Encrypt_Text {

    // Dịch vòng
    private static String circular_shift(String s) {
        if (s.length() < 128) {
            for (int i = s.length(); i < 128; i++) {
                s = "0" + s;
            }
        }

        String answer = "";

        for (int i = 25; i < 128; i++) {
            answer += s.charAt(i);
        }

        for (int i = 0; i < 25; i++) {
            answer += s.charAt(i);
        }

        return answer;
    }

    // XOR
    private static String xor(String x, String y) {
        if (x.length() < 16) {
            for (int i = x.length(); i < 16; i++) {
                x = "0" + x;
            }
        }
        if (y.length() < 16) {
            for (int i = y.length(); i < 16; i++) {
                y = "0" + y;
            }
        }

        String answer = "";

        for (int i = 15; i >= 0; i--) {
            if (x.charAt(i) == y.charAt(i)) {
                answer = "0" + answer;
            } else {
                answer = "1" + answer;
            }
        }

        return answer;
    }

    // cộng modulo
    private static String mod_add(String x, String y) {
        if (x.length() < 16) {
            for (int i = x.length(); i < 16; i++) {
                x = "0" + x;
            }
        }
        if (y.length() < 16) {
            for (int i = y.length(); i < 16; i++) {
                y = "0" + y;
            }
        }

        long first = Long.parseLong(x, 2);
        long second = Long.parseLong(y, 2);
        long sum = (long) (first + second);

        long answer = (long) (sum % (Math.pow(2, 16)));

        return Long.toBinaryString(answer);
    }

    // nhân modulo
    private static String mod_mul(String x, String y) {
        if (x.length() < 16) {
            for (int i = x.length(); i < 16; i++) {
                x = "0" + x;
            }
        }
        if (y.length() < 16) {
            for (int i = y.length(); i < 16; i++) {
                y = "0" + y;
            }
        }

        long first = Long.parseLong(x, 2);
        long second = Long.parseLong(y, 2);
        long mul = (long) first * second;

        long answer = (long) (mul % (Math.pow(2, 16) + 1));

        return Long.toBinaryString(answer);
    }

    // Tạo 52 khóa con
    private static String[] generateSubKey(String key) throws UnsupportedEncodingException {
        if (key.length() < 128) {
            for (int i = key.length(); i < 128; i++) {
                key = '0' + key;
            }
        }

        BigInteger bigInt1 = new BigInteger(key, 2);
        String keyHex = bigInt1.toString(16);
        System.out.println("Key: " + key + " - " + keyHex);

        String subKey[] = new String[52];
        int x, y;

        for (int j = 0; j < 6; j++) {
            x = 0;
            for (int i = 0; i < 8; i++) {
                subKey[i + (8 * j)] = key.substring(x, x + 16);
                x = x + 16;
            }
            key = circular_shift(key);
        }

        subKey[48] = key.substring(0, 16);
        subKey[49] = key.substring(16, 32);
        subKey[50] = key.substring(32, 48);
        subKey[51] = key.substring(48, 64);

        for (int i = 0; i < subKey.length; i++) {
            System.out.println("subKey[" + i + "]:\t" + subKey[i] + "\t-\t" + Long.toHexString(Long.parseLong(subKey[i], 2)));
        }

        return subKey;
    }

    // Mã hóa
    private static String encrypt(String plainText, String[] subKey) throws UnsupportedEncodingException {
        if (plainText.length() < 64) {
            for (int i = plainText.length(); i < 64; i++) {
                plainText = '0' + plainText;
            }
        }

        System.out.println("Plaintext: " + plainText + " - " + Long.toHexString(Long.parseLong(plainText, 2)));

        // Chia thành 4 khối bản rõ mỗi khối 16 bit
        String i[] = new String[4];
        i[0] = plainText.substring(0, 16);
        i[1] = plainText.substring(16, 32);
        i[2] = plainText.substring(32, 48);
        i[3] = plainText.substring(48, 64);

        String d[] = new String[15];

        for (int j = 0; j < 8; j++) {
            System.out.println("Vòng thứ " + (j + 1) + ":");
            System.out.println("i[0]: " + i[0] + " - " + Long.toHexString(Long.parseLong(i[0], 2)));
            System.out.println("i[1]: " + i[1] + " - " + Long.toHexString(Long.parseLong(i[1], 2)));
            System.out.println("i[2]: " + i[2] + " - " + Long.toHexString(Long.parseLong(i[2], 2)));
            System.out.println("i[3]: " + i[3] + " - " + Long.toHexString(Long.parseLong(i[3], 2)));

            d[1] = mod_mul(i[0], subKey[0 + (6 * j)]);
            d[2] = mod_add(i[1], subKey[1 + (6 * j)]);
            d[3] = mod_add(i[2], subKey[2 + (6 * j)]);
            d[4] = mod_mul(i[3], subKey[3 + (6 * j)]);

            d[5] = xor(d[1], d[3]);
            d[6] = xor(d[2], d[4]);
            d[7] = mod_mul(d[5], subKey[4 + (6 * j)]);

            d[8] = mod_add(d[6], d[7]);
            d[9] = mod_mul(d[8], subKey[5 + (6 * j)]);

            d[10] = mod_add(d[7], d[9]);
            d[11] = xor(d[1], d[9]);
            d[12] = xor(d[3], d[9]);
            d[13] = xor(d[2], d[10]);
            d[14] = xor(d[4], d[10]);

            i[0] = d[11];
            i[1] = d[12];
            i[2] = d[13];
            i[3] = d[14];
        }

        // Vòng thứ 9
        System.out.println("Vòng thứ 9:");
        System.out.println("i[0]: " + i[0] + " - " + Long.toHexString(Long.parseLong(i[0], 2)));
        System.out.println("i[1]: " + i[1] + " - " + Long.toHexString(Long.parseLong(i[1], 2)));
        System.out.println("i[2]: " + i[2] + " - " + Long.toHexString(Long.parseLong(i[2], 2)));
        System.out.println("i[3]: " + i[3] + " - " + Long.toHexString(Long.parseLong(i[3], 2)));

        d[1] = mod_mul(i[0], subKey[48]);
        d[2] = mod_add(i[2], subKey[49]);
        d[3] = mod_add(i[1], subKey[50]);
        d[4] = mod_mul(i[3], subKey[51]);

        for (int k = 1; k < 5; k++) {
            if (d[k].length() < 16) {
                for (int h = d[k].length(); h < 16; h++) {
                    d[k] = '0' + d[k];
                }
            }
        }
        String cipher = d[1] + d[2] + d[3] + d[4];
        System.out.println("Ciphertext: " + cipher + " - " + Long.toHexString(Long.parseLong(cipher, 2)));

        return cipher;
    }

    // modulo 2^16
    private static String add_inv(String x) {
        if (x.length() < 16) {
            for (int i = x.length(); i < 16; i++) {
                x = "0" + x;
            }
        }

        long val = Long.parseLong(x, 2);
        long MOD = (long) Math.pow(2, 16);

        if (val > MOD) {
            val = val % MOD;
        }

        val = MOD - val;

        String answer = Long.toBinaryString(val);

        if (answer.length() < 16) {
            for (int i = answer.length(); i < 16; i++) {
                answer = "0" + answer;
            }
        }

        return answer;
    }

    private static String mul_inv(String x) {
        if (x.length() < 16) {
            for (int i = x.length(); i < 16; i++) {
                x = "0" + x;
            }
        }

        Long val = Long.parseLong(x, 2);
        long MOD = (long) Math.pow(2, 16) + 1;

        val = moduloNghichDao(val, MOD);
        String ans = Long.toBinaryString(val);

        if (ans.length() < 16) {
            for (int i = ans.length(); i < 16; i++) {
                ans = "0" + ans;
            }
        }

        return ans;
    }

    // Tính nghịch đảo modulo: x^-1 mod p
    private static long moduloNghichDao(long x, long soModulo) {
        long kd = soModulo;
        long r = 1, q, y0 = 0, y1 = 1, y = 0;

        while (x != 0) {
            r = soModulo % x;

            if (r == 0) {
                break;
            } else {
                q = soModulo / x;
                y = y0 - y1 * q;
                soModulo = x;
                x = r;
                y0 = y1;
                y1 = y;
            }
        }

        if (y >= 0) {
            return y;
        } else {
            y = kd + y;
            return y;
        }
    }

    // Giải mã
    private static String decrypt(String cipherText, String[] subKey) throws UnsupportedEncodingException {
        String d[] = new String[15];

        if (cipherText.length() < 64) {
            for (int i = cipherText.length(); i < 64; i++) {
                cipherText = '0' + cipherText;
            }
        }

        String i[] = new String[4];
        d[1] = i[0] = cipherText.substring(0, 16);
        d[2] = i[1] = cipherText.substring(16, 32);
        d[3] = i[2] = cipherText.substring(32, 48);
        d[4] = i[3] = cipherText.substring(48, 64);

        for (int j = 1; j < 5; j++) {
            if (d[j].length() < 16) {
                for (int k = d[j].length(); k < 16; k++) {
                    d[j] = "0" + d[j];
                }
            }
        }

        //decryption subkeys
        String invk[] = new String[52];
        invk[0] = mul_inv(subKey[48]);
        invk[1] = add_inv(subKey[49]);
        invk[2] = add_inv(subKey[50]);
        invk[3] = mul_inv(subKey[51]);
        invk[4] = (subKey[46]);
        invk[5] = (subKey[47]);

        invk[6] = mul_inv(subKey[42]);
        invk[7] = add_inv(subKey[44]);
        invk[8] = add_inv(subKey[43]);
        invk[9] = mul_inv(subKey[45]);
        invk[10] = (subKey[40]);
        invk[11] = (subKey[41]);

        invk[12] = mul_inv(subKey[36]);
        invk[13] = add_inv(subKey[38]);
        invk[14] = add_inv(subKey[37]);
        invk[15] = mul_inv(subKey[39]);
        invk[16] = (subKey[34]);
        invk[17] = (subKey[35]);

        invk[18] = mul_inv(subKey[30]);
        invk[19] = add_inv(subKey[32]);
        invk[20] = add_inv(subKey[31]);
        invk[21] = mul_inv(subKey[33]);
        invk[22] = (subKey[28]);
        invk[23] = (subKey[29]);

        invk[24] = mul_inv(subKey[24]);
        invk[25] = add_inv(subKey[26]);
        invk[26] = add_inv(subKey[25]);
        invk[27] = mul_inv(subKey[27]);
        invk[28] = (subKey[22]);
        invk[29] = (subKey[23]);

        invk[30] = mul_inv(subKey[18]);
        invk[31] = add_inv(subKey[20]);
        invk[32] = add_inv(subKey[19]);
        invk[33] = mul_inv(subKey[21]);
        invk[34] = (subKey[16]);
        invk[35] = (subKey[17]);

        invk[36] = mul_inv(subKey[12]);
        invk[37] = add_inv(subKey[14]);
        invk[38] = add_inv(subKey[13]);
        invk[39] = mul_inv(subKey[15]);
        invk[40] = (subKey[10]);
        invk[41] = (subKey[11]);

        invk[42] = mul_inv(subKey[6]);
        invk[43] = add_inv(subKey[8]);
        invk[44] = add_inv(subKey[7]);
        invk[45] = mul_inv(subKey[9]);
        invk[46] = (subKey[4]);
        invk[47] = (subKey[5]);

        invk[48] = mul_inv(subKey[0]);
        invk[49] = add_inv(subKey[1]);
        invk[50] = add_inv(subKey[2]);
        invk[51] = mul_inv(subKey[3]);

        for (int j = 0; j < 8; j++) {
            d[1] = mod_mul(i[0], invk[0 + (6 * j)]);
            d[2] = mod_add(i[1], invk[1 + (6 * j)]);
            d[3] = mod_add(i[2], invk[2 + (6 * j)]);
            d[4] = mod_mul(i[3], invk[3 + (6 * j)]);

            d[5] = xor(d[1], d[3]);
            d[6] = xor(d[2], d[4]);

            d[7] = mod_mul(d[5], invk[4 + (6 * j)]);
            d[8] = mod_add(d[6], d[7]);
            d[9] = mod_mul(d[8], invk[5 + (6 * j)]);
            d[10] = mod_add(d[7], d[9]);

            d[11] = xor(d[1], d[9]);
            d[12] = xor(d[3], d[9]);
            d[13] = xor(d[2], d[10]);
            d[14] = xor(d[4], d[10]);

            i[0] = d[11];
            i[1] = d[12];
            i[2] = d[13];
            i[3] = d[14];
        }

        d[1] = mod_mul(i[0], invk[48]);
        d[2] = mod_add(i[2], invk[49]);
        d[3] = mod_add(i[1], invk[50]);
        d[4] = mod_mul(i[3], invk[51]);

        for (int k = 1; k < 5; k++) {
            if (d[k].length() < 16) {
                for (int h = d[k].length(); h < 16; h++) {
                    d[k] = '0' + d[k];
                }
            }
        }
        String decrypt = d[1] + d[2] + d[3] + d[4];
        System.out.println("Decrypt: " + decrypt + " - " + Long.toHexString(Long.parseLong(decrypt, 2)));

        return decrypt;
    }

    // UTF-8 --> Base64 --> ASCII (8 bits liên tiếp)
    private static String convertTextToBinary(String text) throws UnsupportedEncodingException {
        // Chuyển text về Base64
        String textBase64 = Base64.getEncoder().encodeToString(text.getBytes("UTF-8")); // ví dụ: a -> YQ==

        // Chuyển từng kí tự trong mảng Base64 sang bit
        char[] arrChar = textBase64.toCharArray(); // Y Q = =

        String result = "";
        for (int i = 0; i < arrChar.length; i++) {
            String cBinary = Integer.toBinaryString(arrChar[i]);

            // Biểu diễn 1 kí tự ASCII cần 8 bit
            if (cBinary.length() < 8) {
                for (int j = cBinary.length(); j < 8; j++) {
                    cBinary = '0' + cBinary;
                }
            }

            result += cBinary;
        }

        return result;
    }

    private static String convertBinaryToText(String binary) throws UnsupportedEncodingException {
        if (binary.length() < 8) {
            for (int i = binary.length(); i < 8; i++) {
                binary = '0' + binary;
            }
        }

        String result = "";

        // Đọc 8 bits liên tiếp trong mảng binary --> ra được 1 kí tự trong mảng ASCII
        for (int i = 0; i < binary.length(); i++) {
            if (i % 8 == 0) {
                String cBinary = "";
                for (int j = i; j < i + 8; j++) {
                    cBinary += binary.charAt(j);
                }

                int cInteger = Integer.parseInt(cBinary, 2);

                result += (char) cInteger;
            }
        }

        String answer = new String(Base64.getDecoder().decode(result), "UTF-8");

        return answer;
    }

    public static void main(String args[]) throws UnsupportedEncodingException {
//        // Tạo 52 khóa con
        String key = "Minh";
        String subKey[] = generateSubKey("11001000000000011001000000000010010110000000001100100000000000111110100000000100101100000000010101111000000001100100000");
        System.out.println("----------------------------");

        // Mã hóa
        String plainText = "MMH";
        String cipherText = encrypt("10100110010000010100110010000010100110011001100110011111010", subKey);
//        System.out.println("Ciphertext: " + convertBinaryToText(cipherText));
        System.out.println("----------------------------");

        // Giải mã
        String decrypt = decrypt(cipherText, subKey);
//        System.out.println("Decrypt: " + convertBinaryToText(decrypt));
        System.out.println("----------------------------");
    }
}
