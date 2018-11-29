public class Key_Demo {
    private double p , q ,PublicKey_e,PrivateKey_d;
    public double FindPublicKey_n(){
        double PublicKey_n;
        PublicKey_n=this.p*this.q;
        return PublicKey_n;
    }

    public double getPublicKey_e() {
        if (this.PublicKey_e==0){
            this.setPublicKey_e();
        }
        return PublicKey_e;
    }

    public void setPublicKey_e(){
        double parameter = 0;
        parameter = (this.p-1)*(this.q-1);
        int PrimeNum[] = new int[98];
        int num = 0;
        for (int i = 2; i < parameter; i++) {
            if (this.IFPrime(i)){
                if (num > 98){
                    break;
                }
                if (parameter % i != 1){
                    PrimeNum[num] = i;
                    num++;
                }
            }
        }
        int x=(int)(0+Math.random()*(num-1));
        this.PublicKey_e = PrimeNum[x];
    }
    public void setPrivateKey_d(){
        double parameter = 0;
        parameter = (this.p-1)*(this.q-1);
        double parameter2=parameter;
        while ((parameter+1)%this.PublicKey_e != 0){
            parameter =parameter + parameter2 ;
        }
        PrivateKey_d = (parameter+1)/this.PublicKey_e;
    }
// 187 131 11 50 79
    public double getPrivateKey_d() {
        if (this.PublicKey_e==0) {
            this.setPublicKey_e();
        }
        this.setPrivateKey_d();
        return PrivateKey_d;
    }

    public boolean IFPrime (int number){
        int parameter = number /2+1;
        for (int i = 2; i <= parameter; i++) {
            if (number % i == 0){
                return false;
            }
            if(i+1>parameter){
                return true;
            }
        }
        return true;
    }
    Key_Demo(double p,double q){
        this.p=p;
        this.q=q;
    }
}
