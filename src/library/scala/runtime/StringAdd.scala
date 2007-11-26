/*                                                                      *\
**     ________ ___   __   ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2007, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ |_|                                         **
**                                                                      **
\*                                                                      */

// $Id$


package scala.runtime


import Predef._

final class StringAdd(self: Any) {

  def +(other: String) = self.toString + other

  /** Formats string according to given <code>format</code> string.
   *  Format strings are as for <code>String.format</code>
   *  (@see java.lang.String.format).
   */
  def format(format: String): String = 
    String.format(format, Array(self.asInstanceOf[Object]))
}
