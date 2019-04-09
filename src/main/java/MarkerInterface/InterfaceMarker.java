package MarkerInterface;

import java.io.*;

public class InterfaceMarker  {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int originalId = 12;
        BigObject objectOriginal = new BigObject();
        objectOriginal.setId(originalId);

        ByteArrayOutputStream writeBuffer = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(writeBuffer);
        outputStream.writeObject(objectOriginal);
        outputStream.close();

        byte[] buffer = writeBuffer.toByteArray();
        ByteArrayInputStream readBuffer = new ByteArrayInputStream(buffer);
        ObjectInputStream inputStream = new ObjectInputStream(readBuffer);
        BigObject objectCopy = (BigObject)inputStream.readObject();

        if (objectCopy.getId() == originalId)
            System.out.println( "originalId equals copiedId");
    }
}
