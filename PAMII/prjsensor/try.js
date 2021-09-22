import React, { Component } from "react";
import { StyleSheet, View, Image, Dimensions, FingerprintScanner } from "react-native";

const window = Dimensions.get("window");

const deviceWidth = window.width;
const deviceHeight = window.height;

const imageWidth = 8 * deviceWidth;
const imageHeight = deviceHeight;

FingerprintScanner.authenticate({
  description: 'Scaneie sua digital ou identificação facial para continuar'})
  .then(() =>  {
    console.log('Autenticação realizada com sucesso!');
  }).catch((error) => {
    console.log('Erro de autenticação!', error)
  }); 

FingerprintScanner
  .isSensorAvailable()
  .then(biometryType => {
  console.log('Tipo de biometria: ', biometryType)
}).catch(error => console.log('isSensorAvailable erro: ',error));

const App = () => {

  return (
    <View style={styles.container}>
      <Text>Hello</Text>
    </View>
  );

}

export default App;

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
    backgroundColor: "#F5FCFF",
  },
  image: {
    position: "absolute",
    top: 0,
    left: 0,
    height: imageHeight,
    width: imageWidth,
  },
});
