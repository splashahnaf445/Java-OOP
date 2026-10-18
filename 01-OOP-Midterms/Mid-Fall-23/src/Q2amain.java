public class Q2amain {
        public static void main(String[] args) {
            BankAccount b=new
                    BankAccount("Mr.Rahman",1000, "M");
            System.out.println("Account id:"+b.getid());
            System.out.println("balance before:"+b.Balance());
            double x=b.Balance();
            if(x>=0){
                x= x - 2000;
            }

        }
}
