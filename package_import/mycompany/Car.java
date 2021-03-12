package package_import.mycompany;

import package_create.hyndai.*;
import package_create.kumho.*;
import package_import.hankook.*;

public class Car {
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	package_import.hankook.Tire tire3 = new package_import.hankook.Tire();
	package_import.kumho.Tire tire4 = new package_import.kumho.Tire();
}
