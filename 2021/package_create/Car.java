package package_create;

//ctrl + shift + o �� ������ �ڵ����� import ���ش�.
import Class.hankook.*;
import Class.hyndai.*;
import Class.kumho.*;

public class Car {
	//�ʵ�
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	//���� Tire��� Ŭ������ hankook ��Ű���� kumho��Ű�� �Ѵ� �����ϰ� �ֱ� ������, �̷��� ������ Ŭ�������� ȣ���� ��쿡�� package�� �ּҸ� ��� �ۼ��ؾ߸� �Ѵ�.  
	package_create.hankook.Tire tire3 = new package_create.hankook.Tire();
	package_create.kumho.Tire tire4 = new package_create.kumho.Tire();
}
