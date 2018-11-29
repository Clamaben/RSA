public class RSA_Demo {
    private double PublicKey_n,PublicKey_e;
    private double PrivateKey_d;

    public double getPrivateKey_d() {
        return PrivateKey_d;
    }

    public void setPublicKey_n(double publicKey_n) {
        PublicKey_n = publicKey_n;
    }

    public double getPublicKey_e() {
        return PublicKey_e;
    }

    public void setPublicKey_e(double publicKey_e) {
        PublicKey_e = publicKey_e;
    }

    public double getPublicKey_n() {
        return PublicKey_n;
    }

    public void setPrivateKey_d(double privateKey_d) {
        PrivateKey_d = privateKey_d;
    }
    public double encryption(double x){
        double y;
        y=this.cry((int)x, (int)this.PublicKey_e, (int)this.PublicKey_n);
 //        y = Math.pow(x,this.PublicKey_e)%this.PublicKey_n;
        return y;
    }
    public double Decrypt(double y){
        double x;
        x=this.cry((int)y, (int)this.PrivateKey_d, (int)this.PublicKey_n);
 //        x = Math.pow(y,this.PrivateKey_d)%this.PublicKey_n;
        return x;
    }
    public double cry(int x,int y,int z) {
    	double res = 0;
    	int para ;
    		int i=1;
			while(Math.pow(x,i)<z&&i < y){
				i++;
		}
			 int xNext=(int) (Math.pow(x,i)%z);
			  para = y % i;
			  int yNext= (int) (y/i);
				if (i!=1||y!=1) {
					if (para!=0) {
					res=this.cry(xNext, yNext, z)*Math.pow(x,para);
				}else {
					res=this.cry(xNext, yNext, z);
				}
				}else {
					res=x;
				}
    	return res%z;
    }
}
