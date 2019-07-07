package com.example

import java.util.concurrent.TimeUnit
import org.openjdk.jmh.annotations._

@State(Scope.Benchmark)
class MapperBenchmarks {

  @Benchmark
  @BenchmarkMode(Array(Mode.Throughput))
  @OutputTimeUnit(TimeUnit.MILLISECONDS)
  def testNonOptimized(): Unit = {
    NonOptimizedMapper.artist("Pyramid Song")
  }

  @Benchmark
  @BenchmarkMode(Array(Mode.Throughput))
  @OutputTimeUnit(TimeUnit.MILLISECONDS)
  def testOptimized(): Unit = {
    OptimizedMapper.artist("Pyramid Song")
  }

}
