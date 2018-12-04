package soundsystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * CDPlayer类在其构造函数中引用了CompactDisc对象，
 * CDPlayer类的play方法实现调用的是CompactDisc对象的play方法。
 */
@Component//将类注册到Spring容器中
public class CDPlayer implements MediaPlayer {
  private CompactDisc cd;

  @Autowired//注入CompactDisc类的对象
  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }

}
