package certification;

public class InheritTest {
public static void main(String[] args) {
	X xref=new Y();
	Y yref=(Y) xref;
	yref.mY();
	xref.mX();
}
}
class X{
	public void mX(){
		System.out.println("Xm1");
	}
}
class Y extends X{
	public void mX(){
		System.out.println("Xm2");
	}
	public void mY(){
		System.out.println("Ym");
	}
}