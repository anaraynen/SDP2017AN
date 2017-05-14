package vendor

/**
  * A program parser parses a file or string containing a sequence
  * of bytecode programs in textual format. The program parser
  * is used by many vendor libraries to manipulate programs. we do need to parse in bytecode programs so we can
  * execute them on our virtual machine.
  */
trait ProgramParser {
  // a type alias to make it clear!
  type InstructionList = Vector[Instruction]

  /**
    * Parses a file representation of a bytecode program
    * into an `InstructionList`.
    *
    * @param file the file to parse
    * @return an instruction list
    */
  def parse(file: String): InstructionList

  /**
    * Parses a string representation of a bytecode program
    * into an `InstructionList`.
    *
    * @param string the string to parse
    * @return an instruction list
    */
  def parseString(string: String): InstructionList
}