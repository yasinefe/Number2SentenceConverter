# COMMENTS

I will give some dteails about this implementation.

- I used only third party jar such as JUnit and Mockito for unit test.
- If you want to measure unit test coverage you should use 'mvn cobertura:cobertura' command
- I used 'Should' for unit test classes and I configured cobertura to see my test classes in pom.xml
- You can find cobertura coverage report in the RAR file in target folder.
- Unit test coverage is %98.

# USAGE

- You can use Number2SentenceMain to try the implementation


# NEW FEATURES CAN BE ADDED

Following feature can be added but I did not.

- I added English and Turkish languages for this implementation but we can add more languages (wth different NumberLanguage implementations) with a simple change in LanguageFactory class.
- I implemented till 999.999.999 but we can add easily billion, trillion, quadrillion, without chaning implementation...
- If you want to extend capability to billion. You do not have to change the implementation, You have to add new word for billion:

1. Add below type in EnglishWordOfNumber enum class.
 , BILLION
2. Add this line to EnglishNumberLanguage constructor to define the keyword in the map
 numberWordMap.put(1000000000L, toLowerCase(EnglishWordOfNumber.BILLION));
 
Thats all, as you can see changing is only on Language classes and not in the implementation. 

- If we read these keywords from a property file so we can easily create new languages with i8n mechanism.
- Property files can be named with postfix en-EN like most of MVC i18n message resource mechanism.
