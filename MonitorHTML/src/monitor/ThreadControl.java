package monitor;


class ThreadControl {
	
	Thread1 th1 = new Thread1();
	Thread2 th2 = new Thread2();
	Thread3 th3 = new Thread3();
	Thread4 th4 = new Thread4();
	Thread5 th5 = new Thread5();
	Thread6 th6 = new Thread6();
	Thread7 th7 = new Thread7();
	Thread8 th8 = new Thread8();
	Thread9 th9 = new Thread9();
	Thread10 th10 = new Thread10();
	Thread11 th11 = new Thread11();
	Thread12 th12 = new Thread12();
	Thread13 th13 = new Thread13();
	Thread14 th14 = new Thread14();
	Thread15 th15 = new Thread15();
	Thread16 th16 = new Thread16();
	
	public ThreadControl() {
		
		MainWindow mw = new MainWindow();
		mw.MyMainWindow();
			
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();
		th7.start();
		th8.start();
		th9.start();
		th10.start();
		th11.start();
		th12.start();
		th13.start();
		th14.start();
		th15.start();
		th16.start();
		
	}

}
