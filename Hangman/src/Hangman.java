import java.io.FileInputStream;
import com.google.firebase:firebase-admin:6.11.0;
implements com.google.firebase:firebase-admin:6.11.0;


public class Hangman {
	
	public static void main(String []args) {
		
		// Fetch the service account key JSON file contents
		FileInputStream serviceAccount = new FileInputStream("path/to/serviceAccount.json");

		// Initialize the app with a service account, granting admin privileges
		FirebaseOptions options = new FirebaseOptions.Builder()
		    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
		    .setDatabaseUrl("https://<databaseName>.firebaseio.com")
		    .build();
		FirebaseApp.initializeApp(options);

		// As an admin, the app has access to read and write all data, regardless of Security Rules
		DatabaseReference ref = FirebaseDatabase.getInstance()
		    .getReference("restricted_access/secret_document");
		ref.addListenerForSingleValueEvent(new ValueEventListener() {
		  @Override
		  public void onDataChange(DataSnapshot dataSnapshot) {
		    Object document = dataSnapshot.getValue();
		    System.out.println(document);
		  }

		  @Override
		  public void onCancelled(DatabaseError error) {
		  }
		});
		
	}

}
