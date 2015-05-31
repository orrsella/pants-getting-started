# pants-getting-started

Getting started with [Pants Build](https://pantsbuild.github.io/) isn't [easy](https://pantsbuild.github.io/install.html):

> As of September 2014, alas, Pants is not something you can just install and use. To be precise: you can install it, but unless you've also [Set up your code workspace to work with Pants](https://pantsbuild.github.io/setup_repo.html), it won't work. You can use it in a workspace in which some Pants expert has set it up.

> We're fixing this problem, but we're not done yet.

> If want to try out Pants and no Pants expert has set it up for you, you might try [https://github.com/twitter/commons](https://github.com/twitter/commons).

So that's what I did – used existing pants setups to figure out the minimal Scala/Java project structure to get a Pants project compiling and running tests (including running tests written with JUnit, ScalaTest and Specs2). All you need to do to get started is [install](https://pantsbuild.github.io/install.html) the Pants executable ([System-wide Installation](https://pantsbuild.github.io/install.html#system-wide-installation) using `pip` works great for me), and you're good to go:

```bash
$ pip install pantsbuild.pants
$ git clone git@github.com:orrsella/pants-getting-started.git
$ cd pants-getting-started/
$ pants test example:
```

Want more? Read [the friendly docs](https://pantsbuild.github.io/first_concepts.html). You can also watch [Twitter University's intro videos](https://engineering.twitter.com/university/videos/getting-started-with-the-pants-build-system-why-pants).

If you're interested, here's [some background](https://orrsella.com/2015/05/31/getting-started-with-pants-build-for-scala-projects/) for this small template project.
