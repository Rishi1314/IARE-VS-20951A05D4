import java.util.Scanner;  

class reverserecursion{
    public String reverserecursion(String str){
        int l=str.length();
        if (l<=1){
            return str;
        }else{
            
            return reverserecursion(str.substring(l/2))+reverserecursion(str.substring(0,l/2));
        }
    }

    public String reversePara(String str){
        if (str.length()<=1){
            return str;
        }else{
            int sep_pos=str.indexOf(" ");
            if (sep_pos<0){
                return reverserecursion(str);
            }
            return reverserecursion(str.substring(0,sep_pos))+str.charAt(sep_pos)+reversePara(str.substring(sep_pos+1));
        }
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");  
        String str= sc.nextLine(); 
        reverserecursion ri=new reverserecursion();
        String res=ri.reversePara(str);
        System.out.println(res);
    }
}