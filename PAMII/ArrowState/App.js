import { StatusBar } from 'expo-status-bar';
import React, {useState} from 'react';
import { StyleSheet, Text, TextInput, View, Image, Button, Alert} from 'react-native';

export default function App() {

  const [nome, setNome] = useState();
  const [email, setEmail] = useState();
  const [assunto, setAssunto] = useState();
  const [mensagem, setMsg] = useState();

  return (
    
    <View style={styles.container}>
      
      <StatusBar style="auto" />

      <Text style={styles.titulo}>Contate-nos</Text>

      

      <View style={styles.inputs}>

        <Text style={styles.placeholderI}>Nome: </Text>
        <TextInput 
        style={styles.input}
        autoFocus={true}
        onChangeText={text => setNome(text)}
        />

      <Text style={styles.placeholderI}>E-mail: </Text>
        <TextInput 
        style={styles.input}
        keyboardType={'email-address'}
        onChangeText={text => setEmail(text)}
        />

        <Text style={styles.placeholderI}>Assunto: </Text>
        <TextInput 
        style={styles.input}
        onChangeText={text => setAssunto(text)}
        />

        <Text style={styles.placeholderI}>Mensagem: </Text>
        <TextInput 
        style={styles.input}
        multiline={true}
        numberOfLines={4}
        onChangeText={text => setMsg(text)}
        />

      </View>

      <Button 
      title="ENVIAR"
      style={styles.botao}
      onPress={()=> Alert.alert('Mensagem', 'Nome: '+nome+'\n\nE-mail: '+email+'\n\nAssunto: '+assunto
      +'\n\nMensagem: '+mensagem)}
      />

      <View>
        <Image source={require('./imagens/message.png')} style={styles.img}></Image>
      </View>

    </View>
  );
}

const styles = StyleSheet.create({
  img: {
    width: 300,
    height: 200,
    resizeMode: 'contain',
    margin: 0
  },

  container: {
    backgroundColor: '#E8E8EA',
    alignItems: 'center',
    height: '100%'
  },

  titulo: {
    fontSize: 50,
    marginTop: 50,
    color: '#6C63FF',
    fontFamily: 'serif'
  },

  input: {
    borderColor: '#6C63FF',
    borderWidth: 1,
    borderRadius: 5,
    width: 300,
    padding: 10,
    marginBottom: 10
  },

  placeholderI: {
    color: 'black',
  },

  botao: {
    width: 300,
    marginTop: 10,
  }

});
