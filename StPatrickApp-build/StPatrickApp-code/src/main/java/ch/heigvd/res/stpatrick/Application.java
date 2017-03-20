package ch.heigvd.res.stpatrick;


/**
 * 
 * @author Olivier Liechti
 */
public class Application {

  IStreamProcessorsFactory processorsFactory = new StreamProcessorsFactory();
  
  public IStreamProcessorsFactory getStreamProcessorsFactory() {
    return processorsFactory;
  }

  IStreamDecoratorController getStreamDecoratorController() {


    return (IStreamDecoratorController) new ModifiedStreamProcessor('a');
  }
}
