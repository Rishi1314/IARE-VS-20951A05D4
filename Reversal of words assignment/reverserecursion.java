import java.util.Scanner;  

class reversestring{
    public String reverseString(String str){
        int l=str.length();
        if (l<=1){
            return str;
        }else{
            
            return reverseString(str.substring(l/2))+reverseString(str.substring(0,l/2));
        }
    }

    public String reversePara(String str){
        if (str.length()<=1){
            return str;
        }else{
            int sep_pos=str.indexOf(" ");
            if (sep_pos<0){
                return reverseString(str);
            }
            return reverseString(str.substring(0,sep_pos))+str.charAt(sep_pos)+reversePara(str.substring(sep_pos+1));
        }
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");  
        String str= sc.nextLine(); 
        reversestring ri=new reversestring();
        String res=ri.reversePara(str);
        System.out.println(res);
    }
}