This is a minimal [Giter8][g8] template for sblas - Scala Native BLAS (Basic Linear Algebra Subprograms)

Please refer to the **sblas** [README](https://github.com/ekrich/sblas#sblas---scala-native-blas) first.

```
$ sbt new ekrich/sblas.g8
$ cd <directory entered after the prompt>
$ sbt run
```

License
-------
Written in 2019 by Eric Richardson

To the extent possible under law, the author(s) have dedicated all copyright and
related and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See
<http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/

Contributors
------------

To run locally use the following setup instructions.

http://www.foundweekends.org/giter8/setup.html

Then run the following commands from the directory containing the `sblas.g8` project to test.

```
$ g8 file://sblas.g8
A minimal project that uses sblas.
name [Enter the sblas project directory name]: sblas-test
...
$ cd sblas-test
$ sbt
> run
...
```
You should see compiling, linking, and some BLAS output.
