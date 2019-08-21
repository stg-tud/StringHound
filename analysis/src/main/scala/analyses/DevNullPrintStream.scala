package analyses

import java.io.{OutputStream, PrintStream}
import java.util.Locale

class DevNullOutputStream extends OutputStream {
  override def write(i: Int): Unit = {
  }

  override def write(b: Array[Byte]): Unit = {
  }

  override def write(b: Array[Byte], off: Int, len: Int): Unit = {
  }

  override def flush(): Unit = {
  }

  override def close(): Unit = {
  }
}


class DevNullPrintStream extends PrintStream(new DevNullOutputStream) {

  override def flush(): Unit = {

  }

  override def close(): Unit = {

  }

  override def checkError: Boolean = false

  override protected def setError(): Unit = {

  }

  override protected def clearError(): Unit = {

  }

  override def write(b: Int): Unit = {

  }

  override def write(buf: Array[Byte], off: Int, len: Int): Unit = {

  }

  override def print(b: Boolean): Unit = {

  }

  override def print(c: Char): Unit = {

  }

  override def print(i: Int): Unit = {

  }

  override def print(l: Long): Unit = {

  }

  override def print(f: Float): Unit = {

  }

  override def print(d: Double): Unit = {

  }

  override def print(s: Array[Char]): Unit = {

  }

  override def print(s: String): Unit = {

  }

  override def print(obj: Any): Unit = {

  }

  override def println(): Unit = {

  }

  override def println(x: Boolean): Unit = {

  }

  override def println(x: Char): Unit = {

  }

  override def println(x: Int): Unit = {

  }

  override def println(x: Long): Unit = {

  }

  override def println(x: Float): Unit = {

  }

  override def println(x: Double): Unit = {

  }

  override def println(x: Array[Char]): Unit = {

  }

  override def println(x: String): Unit = {

  }

  override def println(x: Any): Unit = {

  }

  override def printf(format: String, args: Object*): PrintStream = this

  override def printf(l: Locale, format: String, args: Object*): PrintStream = this

  override def format(format: String, args: Object*): PrintStream = this

  override def format(l: Locale, format: String, args: Object*): PrintStream = this

  override def append(csq: CharSequence): PrintStream = this

  override def append(csq: CharSequence, start: Int, end: Int): PrintStream = this

  override def append(c: Char): PrintStream = this
}
