#!/bin/bash

checkRubyInstallation(){
    rubyValue=`which ruby`
    if [ $? -eq 0 ] 
    then
        echo "Ruby installed"
        if [ $rubyValue == '/usr/local/bin/ruby' ]
        then
            echo "ruby installed in :"$rubyValue
            echo "installing home brew"
            /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
            if [ $? -eq 0 ] 
            then    
                echo "Home brew successfully installed"
            else
                echo "Some thing went wrong installing homebrew"
                exit 1
            fi
        fi
    else
        echo "Ruby not installed"
        exit 1
    fi
}

installGoLang(){
    value=`brew search golang`
    if [[ $value == *"golang"* ]]; then
        echo "GoLang present"
    fi
}

#checkRubyInstallation
installGoLang