# A project used to reproduce rlwrap issue #98

The issue: https://github.com/hanslub42/rlwrap/issues/98

## Prerequisite

You need setup the following software packages to run the demo project:

1. JDK 1.7 or 1.8
2. Maven 3.6.x

## Reproduce steps:

1. Clone or download this repo
2. Open console window, enter the project folder and type `mvn clean compile act:run`
3. Open another console window, type `rlwrap nc localhost 5461`
4. Then type `bar`

You can see the bar will cause the screen scroll up.

If you use `nc localhost 5461` without `rlwrap` in step 3, then the screen will not scroll up.
 