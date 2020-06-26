package mybatis;

import com.imooc.student.model.Student;
import com.imooc.student.dao.StudentDAO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class StudentTest3 {
	@Autowired
	private StudentDAO studentDAO;
	 public static void main(String[] args) {
	        String resource = "mybatis-config.xml";
	        // 通过流将核心配置文件读取进来
	        InputStream inputStream;
			try {
				inputStream = Resources.getResourceAsStream(resource);
				 // 通过核心配置文件创建会话工厂
		        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		        
		        // 通过会话工厂创建会话
		        SqlSession session = factory.openSession();
		        //搜索单个对象
				Student student = session.selectOne("com.imooc.student.model.StudentDAO.selectByPrimaryKey", "001");
				System.out.println(student);
		        //新增
/*		        		        User user = new User();
		        user.setUsername("赵四");
		        user.setBirthday(new Date());
		        user.setSex("1");
		        user.setAddress("北京昌平");
		        session.insert("User.insertUser", user);
		        // mybatis中事务默认是开启的，所以在mybatis中不需要显式开启事务，只需要显式提交事务
		        session.commit();
		        //删除
		        session.delete("User.deleteUserById", 7);
		        session.commit();
		        //修改
		        User user2 = new User();
		        user2.setUsername("赵四121");
		        user2.setId(5);
		        session.update("User.updateUserById", user2);
		        session.commit();*/
		        
		        
			} catch (IOException e) {
				e.printStackTrace();
			}
	       
	}
}