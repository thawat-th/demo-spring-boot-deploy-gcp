Deploy to GCP

Install dependencies with maven
```
mvn clean pakage
```

Copy the .jar file into src/main/appengine/

Use the gcloud CLI tool
```
gcloud auth login

gcloud config set project PROJECT_ID
```

Run gcloud app deploy to deploy your app
```
gcloud app deploy
```