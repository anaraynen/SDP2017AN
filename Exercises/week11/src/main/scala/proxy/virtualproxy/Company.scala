package main.scala.proxy.virtualproxy

/**
  * Created by anaraynen on 25/04/2017.
  */
case class Company(
                    var companyName: String,
                    var companyAddress: String,
                    var companyContactNo: String,
                    var contactList: ContactList
                  ) {
  println("Company object created...")
}