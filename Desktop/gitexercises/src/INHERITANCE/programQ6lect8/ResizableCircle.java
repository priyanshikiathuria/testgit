/*6.	Define the interface / class hierarchy as detailed in the following class diagram:

Definition of Done:
e)	The class definitions are defined as per the class diagram.
f)	Each class definition is stored in its own .java file.
g)	Base class constructors are invoked using super keyword
h)	Function overriding is applied wherever applicable.
*/

class ResizableCircle extends Circle implements Resizable
{

	{
	ResizableCircle(double rad)
	{
		super(rad);
	}

public void resize(int percent);
{
rad = (rad*percentage)/100;
}

}