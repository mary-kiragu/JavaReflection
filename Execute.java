public class Execute{
	 //main method
	 public static void main(String [] args){
		Dog x=new Dog();
			x.breed="maltese";
			x.size="small";
			x.age=2;
			x.colour="black";
			System.out.println(x.getInfo());
			Dog y=new Dog();
			y.breed="Chihuahua";
			y.size="small";
			y.age=3;
			y.colour="White";
			System.out.println(y.getInfo());
	 
	 }
}