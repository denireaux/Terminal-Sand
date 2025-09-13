# TerminalSand 
## What is it?
    TerminalSand is a free, open-source terminal-based, and simple falling sand simulation that is inspired by the 'powder toys' of the early 2000's.
    In a general sense this is meant for people who routinely use their terminals and sometimes get stuck waiting on builds in the background (Or so is why I made it).
    
## How do I run it?
    1. Fork and/or clone the project.
    2. cd into the project-root and run the following...
        javac TerminalSand.java
        java TerminalSand

            NOTE: If you are unfamiliar with how java works, the first command will, in a nutshell compile the .java file, and the second command will run the program.

    3. Optional, but reccomended...
        if you have a .bashrc file or similar you may want to put the below function in there, that way, at anytime you can just type "sand" and it'll run.
        Below is an example of what that would look like...

            tsand() {
                TERMINAL_SAND_DIRECTORY=~/projects/TFallingSand
                cd "$TERMINAL_SAND_DIRECTORY"
                javac TerminalSand.java
                java TerminalSand
            }

    4. To exit, send a signal interrupt (SIGINT) into your terminal via 'control + c'.

    5. Feel absolutely free to modify the source file and make it yours!

## Other considerations...
*If you have issues with bright, and/or rapid flashing, I wouldn't reccomend utilizing this in more performant terminals, or at all.*

    Terminal performance makes a difference in refresh rate and more 'performant' terminals such as Alacritty can produce more rapid flashing.
    If you would like to slow the "refresh" rate down, it is done in line 20, in the main method. (There is a comment above what, and how to edit it).

    Thank you,
        - D'Angelo L. DeNiro
