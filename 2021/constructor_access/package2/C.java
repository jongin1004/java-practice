package constructor_access.package2;

import constructor_access.package1.*;

public class C {
	//�ʵ�
	A a1 = new A(true);
	A a2 = new A(1); //AŬ�������� int Ÿ�� �Ű������� �����ڴ� default�� �ۼ��Ǿ��ֱ� ������, ��Ű���� �ٸ� CŬ���������� ������ ȣ���� �Ұ���
	A a3 = new A("���ڿ�"); //private�̱� ������ ȣ�� �Ұ���.
}
