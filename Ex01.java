import java.util.Scanner;

class Users{
    public int id;
    public double[] eval = new double[100];
    public int num;
    public Users(double[][] A, int i,int num){
      this.id=i;
      for(int j=0;j<num;j++)
        this.eval[j]=A[id-1][j];
    }
    public int getID(){
      return this.id;
    }

    public double[] getEval(){
      return this.eval;
    }

    public int getNum(){
      return num;
    }
/*
    public void clac(Users s){

    }
*/
}
/*
class Calc{
  private double[] score_0 = new double[100];
  private double[] score_1 = new double[100];
  private
  public calc(Users s,int m){
    for(int i=0;i<m;i++)
      this.score_0[i] =
  }
}
*/
public  class Ex01{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();  //nは人数
    int m = sc.nextInt();   //mは本の数
    double[][] A = new double[n][m];
    double[][] Eval = new double[n][m];
    Users user[] = new Users[n];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        A[i][j]=sc.nextDouble();
      }
    }
    for(int i=0;i<n;i++)
      user[i]=new Users(A,i+1,m);

    for(int i=0;i<n;i++)
      Eval[i]=user[i].getEval();
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
      System.out.print(Eval[i][j]+" ");
      }
    System.out.println();
   }
  }
}
