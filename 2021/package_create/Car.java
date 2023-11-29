package package_create;

//ctrl + shift + o 를 누르면 자동으로 import 해준다.
import Class.hankook.*;
import Class.hyndai.*;
import Class.kumho.*;

public class Car {
	//필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	//지금 Tire라는 클래스는 hankook 패키지와 kumho패키지 둘다 존재하고 있기 때문에, 이렇듯 동일한 클래스명을 호출할 경우에는 package의 주소를 모두 작성해야만 한다.  
	package_create.hankook.Tire tire3 = new package_create.hankook.Tire();
	package_create.kumho.Tire tire4 = new package_create.kumho.Tire();
}
