# ton-eighty

Clojure webapp for keeping dart scores and standings.

## Usage

`lein run`

## References

Lots of the stack used was taken from [this heroku article][1]

[1]: https://devcenter.heroku.com/articles/clojure-web-application

## Dependencies

* [Clojure core][3]
* [Clojure jdbc][4]
* [postgresql][5]
* [ring-jetty-adapter][6]
* [compojure][7]
* [hiccup][8]

[3]: http://clojure.com/
[4]: https://github.com/clojure/java.jdbc
[5]: https://clojars.org/postgresql
[6]: https://clojars.org/ring/ring-jetty-adapter
[7]: https://github.com/weavejester/compojure
[8]: https://github.com/weavejester/hiccup

## Development

I'm trying to use [LightTable][2] (version 0.4.11) as the primary development platform. If you open up the directory in the workspace,
you can eval a line from the core.clj file to connect to the project. Once you do that you can start a repl (`ctrl-space` then `Instarepl`).

Now you can use in-line evaluation of commands each line will eval as you type, for instance:

```clojure
(require '[hiccup.core :as h])

(h/html [:h1 "Hello World"])
```

[2]: http://www.lighttable.com/

## License

Copyright © 2013 Dennis Lipovsky

Distributed under the MIT License.
