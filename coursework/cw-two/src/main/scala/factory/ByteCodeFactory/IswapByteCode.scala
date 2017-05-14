package factory.ByteCodeFactory

import bc.{ByteCode, ByteCodeValues}
import vm.VirtualMachine

/**
  * Created by anaraynen on 17/03/2017.
  */
class IswapByteCode extends ByteCode{
  /**
    * A unique byte value representing the bytecode. An implementation
    * will set this to the bytecode corresponding to the name of the
    * bytecode in [[ByteCodeValues]]
    */
  override val code: Byte = bytecode("iswap")

  /**
    * Returns a new [[VirtualMachine]] after executing this bytecode operation.
    *
    * @param vm the initial virtual machine
    * @return a new virtual machine
    */
  override def execute(vm: VirtualMachine): VirtualMachine = {
    val x = vm.pop()._1
    val y = vm.pop()._1

    vm.push(x)
    vm.push(y)

  }
}
