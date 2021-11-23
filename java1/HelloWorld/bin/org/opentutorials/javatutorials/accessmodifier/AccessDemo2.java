package org.opentutorials.javatutorials.accessmodifier;
class B {
    public String a(){
        return "public void a()";
    }
    protected String b(){
        return "public void b()";
    }
    default String c(){
        return "public void c()";
    }
    private String d(){
        return "public void d()";
    }
   
}
public class AccessDemo2 {
    public static void main(String[] args) {

		B bb = new B();
	 
     System.out.println(bb.a());
     // 아래 코드는 오류가 발생한다.
     //System.out.println(a.z());
     System.out.println(bb.b());
    }
}
