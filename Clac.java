public class Clac{

	public static void main(String[] args){

 	char op='*';
         int a=10;
         int b=20;
         int result;
  
     switch(op){
   
     case '+':
              result=a+b;
              System.out.println("addition is="+result);
              break;
     case '-':
              result=a-b;
              System.out.println("subtraction is="+result);
              break;
     case '*':
              result=a*b;
              System.out.println("multification is="+result);
              break;
    case '/':
              result=a/b;
              System.out.println("division is="+result);
              break;
    default:
             System.out.println("result not found");
    }
  }
}

       