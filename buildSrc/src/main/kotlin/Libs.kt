object Libs {

   const val kotlinVersion = "1.4.0"
   const val dokkaVersion = "0.10.1"
   const val kotestGradlePlugin = "0.1.3"

   object Kotest {
      private const val version = "4.2.3"
      const val assertionsCore = "io.kotest:kotest-assertions-core:$version"
      const val assertionsJson = "io.kotest:kotest-assertions-json:$version"
      const val junit5 = "io.kotest:kotest-runner-junit5:$version"
      const val proptest = "io.kotest:kotest-property:$version"
   }

   object Kotlinx {
      private const val version = "1.0.0-RC"
      const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-core:$version"
   }

   object Xerial {
      const val snappy = "org.xerial.snappy:snappy-java:1.1.7.6"
   }

   object Avro {
      private const val version = "1.10.0"
      const val avro = "org.apache.avro:avro:$version"
   }
}