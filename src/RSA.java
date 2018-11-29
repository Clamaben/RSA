import java.util.Scanner;

public class RSA {
    public static void main(String args[]){
        System.out.println("Welcome to use RSA!");
        int selectNum=10;
        while (selectNum!=0) {
            System.out.println("please chose what you want to do:");
            System.out.println("1.produce key 2.encryption 3.Decrypt");
            Scanner sanner = new Scanner(System.in);
            selectNum = sanner.nextInt();
            switch (selectNum) {
                case 1: {
                    System.out.println("please input two number:");
                    int p = sanner.nextInt();
                    int q = sanner.nextInt();
                    Key_Demo key = new Key_Demo(p, q);
                    int n = p * q;
                    System.out.println("the public key :" + n + "," + (int)key.getPublicKey_e());
                    System.out.println("the private key :" + (int)key.getPrivateKey_d());
                }
                break;
                case 2: {
                    System.out.println("please input the public key:");
                    int PublicKey_n = sanner.nextInt();
                    int PublicKey_e = sanner.nextInt();
                    RSA_Demo Rsa = new RSA_Demo();
                    Rsa.setPublicKey_n(PublicKey_n);
                    Rsa.setPublicKey_e(PublicKey_e);
                    System.out.println("please input the unmber " +
                            "that you want to encryption:");
                    int x = sanner.nextInt();
                    double y = Rsa.encryption(x);
                    System.out.println("OK! the reasult :" + (int)y);
                }
                break;
                case 3: {
                    System.out.println("please input the public key:");
                    int PublicKey_n = sanner.nextInt();
                    int PublicKey_e = sanner.nextInt();
                    RSA_Demo Rsa = new RSA_Demo();
                    Rsa.setPublicKey_n(PublicKey_n);
                    Rsa.setPublicKey_e(PublicKey_e);
                    System.out.println("please input the private key:");
                    int PrivateKey_d = sanner.nextInt();
                    Rsa.setPrivateKey_d(PrivateKey_d);
                    System.out.println("please input the unmber " +
                            "that you want to Decrypt:");
                    int y = sanner.nextInt();
                    double x = Rsa.Decrypt(y);
                    System.out.println("OK! the reasult :" + (int)x);
                }
                break;

            }

        }
    }
}
