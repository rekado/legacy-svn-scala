// won't fix. Constructor code 

// As discussed here: http://www.nabble.com/Companion-object-constructor-visibility-td24342096.html

//Simplified example:

    class Foo private (val value : Int)

    abstract class Bar(val ctor : (Int) => Foo)

    object Foo extends Bar(new Foo(_)) { //<--- ILLEGAL ACCESS
      def main(args: Array[String]){}
    }

//however the following is legal:
/*
    class Foo private (val value : Int)

    abstract class Bar{

        var ctor : (Int) => Foo

    }

    object Foo extends Bar{

        ctor = new Foo(_) //<--- Legal access

    }

The constructor invocation of Bar is done within the scope of object Foo's constructor, and therefor the private constructor of Foo should be visible and accessible.
*/
