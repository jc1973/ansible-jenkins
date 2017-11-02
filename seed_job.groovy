def script_dir = new File(getClass().protectionDomain.codeSource.location.path).parent
def jobs_dir = script_dir + "/jobs"

//new File("jobs").eachFile() { file->  
new File(jobs_dir).eachFile() { file->  
  println file.getName();
  def filename = jobs_dir + "/" + file.getName()
  println filename
  evaluate(new File(filename))


//   
//   //  println file.getName();
//     //# evaluate(new File(file.getName())
//     def filename = "jobs/" + file.getName()
//     
//     // evaluate(new File(file.getName()))
//     evaluate(new File(filename))
//     evaluate(new File(filename))

}  

