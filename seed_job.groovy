new File("jobs").eachFile() { file->  
//  println file.getName();
  //# evaluate(new File(file.getName())
  def filename = "jobs/" + file.getName()
  
  // evaluate(new File(file.getName()))
  evaluate(new File(filename))

}  

