class Test{
	int a,b;
	Test(int i,int j){
	a=i;
	b=j;
}
void meth(Test o){
	o.a *=2;
	o.b /=2;
}
}
class CallByRefDemo{
	public static void main(String args[]){
	Test ob=new Test(15,20);
	System.out.println("ob.a and ob.b before class:"+ob.a+" "+ob.b);
	ob.meth(ob);
	System.out.println("ob.a and ob.b call:"+ob.a+" "+ob.b);
}
}
