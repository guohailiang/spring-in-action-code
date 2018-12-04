package soundsystem;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//让测试运行于spring环境，测试套件是用来组织多个测试类一起运行的，使用 @RunWith注解
@ContextConfiguration(classes=CDPlayerConfig.class)//Spring整合JUnit4测试时，使用注解引入一个或者多个类的class对象（字节码）
public class CDPlayerTest {

  //使用这个Rule可以创建一些临时“目录或者文件”来存放日记记录等信息，在一个测试方法结束之后，系统会自动清空他们
  @Rule
  public final StandardOutputStreamLog log = new StandardOutputStreamLog();

  @Autowired //注入对象
  private MediaPlayer player;
  
  @Autowired //注入对象
  private CompactDisc cd;
  
  @Test //表明为一个测试方法，被Junit调用
  public void cdShouldNotBeNull() {
    assertNotNull(cd);
  }

  @Test
  public void play() {
    player.play();
//    assertEquals(
//        "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n",
//        log.getLog());
  }

}
