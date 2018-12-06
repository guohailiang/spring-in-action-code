package soundsystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 其他两种方式为注解和XML方式
 * 此处采用JavaConfig方式将类的对象注册到Spring容器
 * 主要使用了两个注解的组合：@Configuration和@Bean
 */
@Configuration
public class CDPlayerConfig {
  
  @Bean //常用于修饰方法
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }
  
  @Bean
  public CDPlayer cdPlayer(CompactDisc compactDisc) {
    return new CDPlayer(compactDisc);
  }

}
