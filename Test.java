public class Test {
    public static void main(String[] arg)
    {
        Test tt = new Test();
        System.out.println("안녕하세요." );
        //String tt = aa("jj");
        System.out.println(tt.aa("jj"));
    }
    public String aa(String a)
    {
        System.out.println("이것은 무엇인가?"+a);
        return "tt";
    }

}