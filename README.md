# JMH Benchmarking example (Scala)

The purpose of this project is to showcase a minimal working version of code being benchmarked using sbt-jmh

## Getting Started

### Prerequisites

sbt

### Running

To run these benchmarks:

* Start sbt by running: 
    ```
    sbt
    ```

* You can start benchmarking by running the following command (this executes the benchmarks with some default configurations):

    ```
    benchmarks/jmh:run -i 5 -wi 5 -f1 -t1 .*MapperBenchmarks.*
    ```
## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning 

## Authors

* **Pedro Amaral** -[pedrocodacy](https://github.com/pedrocodacy)


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* **Billie Thompson** - *README template* - [PurpleBooth](https://github.com/PurpleBooth)
