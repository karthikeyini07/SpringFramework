package springpackage;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpring {

	public static void main(String[] args) {
		/*Resource r =new ClassPathResource("springpackage/springconfig.xml");
		BeanFactory b= new XmlBeanFactory(r);*/
		ClassPathXmlApplicationContext b=new ClassPathXmlApplicationContext("springpackage/springconfig.xml");
		
		book book=(book)b.getBean("s1");
		book.setBook_name("The complete reference of spring");
		book.setBook_author("Rod johnson");
		
		System.out.println("Book Id : "+book.getBook_id());
		System.out.println("Book Name : "+book.getBook_name());
		System.out.println("Author : "+book.getBook_author());
		
       ClassPathXmlApplicationContext b1=new ClassPathXmlApplicationContext("springpackage/springconfig.xml");
       book  book1=(book)b1.getBean("s1");
       
       System.out.println("Book Id : "+book1.getBook_id());
		System.out.println("Book Name : "+book1.getBook_name());
		System.out.println("Author : "+book1.getBook_author());
      
		
	}

}
