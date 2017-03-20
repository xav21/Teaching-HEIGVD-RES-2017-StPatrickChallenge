package ch.heigvd.res.stpatrick;

/**
 * This class is responsible for providing different types of Stream Processors.
 * 
 * @author Olivier Liechti
 */
public class StreamProcessorsFactory implements IStreamProcessorsFactory {

  @Override
  public IStreamProcessor getProcessor() {
    return new BasicStreamProcessor();
  }

  @Override
  public IStreamProcessor getProcessor(String processorName) throws UnknownNameException {

    if(processorName == "e-remover")
    {
      return  eremover();
    }

    return null;

  }

  private IStreamProcessor eremover() {
    return new ModifiedStreamProcessor('e');
  }
}
