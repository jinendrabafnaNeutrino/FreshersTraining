public class StringBufferDemo {
    public static void main(String [] args){
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<=5;i++){
            sb.append(i).append(" ");

        }
        System.out.println(sb);
    }

}
