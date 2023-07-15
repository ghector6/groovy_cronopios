class Person {
  def name
  def email

  def getName() {
    return this.name
  }

  def setName(name) {
    return this.name = name

  }

//  def getEmail() {
//    return this.email
//  }


}

def hector = new Person(email: "makingdevs.com")

println hector.getEmail()
println hector.setName("Rose")
