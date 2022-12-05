package com.b.singleton_pattern;

import java.io.Serializable;

//only one object per ex: 
class MySingleton implements Serializable, Cloneable {
	private volatile static MySingleton mySingleton;// Eager vs Lazy

	private MySingleton() {
		if (mySingleton != null) {
			throw new IllegalStateException();
		}
	}
	//t1 t2
	public  static MySingleton getMySingleton() {
		if(mySingleton==null) {
			synchronized (MySingleton.class) {
				if(mySingleton==null) {
					mySingleton=new MySingleton();
				}
			}
		}
		return mySingleton;
	}

	private Object readResolve() {
		return mySingleton;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return mySingleton;
	}

}

public class F_Exp_With_Sigleton_Pattern {
	public static void main(String[] args) {

		MySingleton mySingleton = MySingleton.getMySingleton();
		System.out.println(mySingleton.hashCode());

		MySingleton mySingleton2 = MySingleton.getMySingleton();
		System.out.println(mySingleton.hashCode());

		
		// throws ClassNotFoundException,
//		InstantiationException, IllegalAccessException, IllegalArgumentException, 
//		InvocationTargetException, FileNotFoundException, IOException, CloneNotSupportedException {
//		//ser
//		MySingleton mySingleton=MySingleton.getMySingleton();
//		System.out.println(mySingleton.hashCode());
//		
//		//clonning
//		
//		MySingleton mySingleton2=(MySingleton) mySingleton.clone();
//		
//		System.out.println(mySingleton2.hashCode());
//		ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(new File("foo.ser")));
//		oos.writeObject(mySingleton);
//	
//		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("foo.ser")));
//		
//		MySingleton mySingleton2=(MySingleton) ois.readObject();
//		
//
//		System.out.println(mySingleton2.hashCode());

//		//break it java ref
//		Class<?> clazz= Class.forName("com.b.anno_ref.MySingleton");
//		Constructor[]constructors=clazz.getDeclaredConstructors();
//		constructors[0].setAccessible(true);// even if ctr is private dont care about it ...it can break oops encapusation concepts
//		
//		MySingleton mySingleton2=(MySingleton) constructors[0].newInstance();
//		System.out.println(mySingleton2.hashCode());
//	

		// clone can break it

		// multiple class loader can break it

//		MySingleton mySingleton2=MySingleton.getMySingleton();
//		System.out.println(mySingleton2.hashCode());

	}
}
